SRCREV="${AUTOREV}"
TRIK_RUNTIME_UPDATE = "${SRCREV}"
GIT_REVISION = "branch=master"
PV = "git${SRCREV}"
#PR="r${TRIK_RUNTIME_UPDATE}"
require trik-runtime-qt5.inc
DEPENDS += "python3 rsync-native"
DEPENDS += "gcc-sanitizers"
RDEPENDS_${PN} += "bash xz"

require trik-runtime-install-new.inc

#OE_QMAKE_CXXFLAGS_append += " -fno-lto"

#We need to switch precompiled headers off until this issue is fixed in trik-runtime sources
EXTRA_QMAKEVARS_PRE += " -r CONFIG+=noPch CONFIG+=sanitize_address CONFIG+=sanitize_undefined"

# For script gathering logs information
RDEPENDS_${PN} += "bash xz"
#INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
#INHIBIT_PACKAGE_STRIP = "1"
#DEBUG_BUILD = "1"
