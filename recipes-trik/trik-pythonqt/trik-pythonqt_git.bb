DECRIPTION = "PythonQt with TRIK build patches"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=fbc093901857fcd118f065f900982c24"

inherit pkgconfig qmake5

DEPENDS += "python qtbase"
SRCREV="${AUTOREV}"
SRC_URI = "git://github.com/trikset/trik-pythonqt.git;protocol=https;branch=master" 


S = "${WORKDIR}/git"
EXTRA_QMAKEVARS_PRE += "ARCHITECTURE=arm"
EXTRA_OEMAKE += "-C src"
do_install() {
	oe_libinstall -so -C lib libPythonQt ${D}${libdir}
	install -m 0644 -D -t ${D}${includedir}/pythonqt ${S}/src/*.h

}
