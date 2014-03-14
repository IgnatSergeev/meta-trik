PR = "r1"

inherit kernel

SECTION = "Kernel"
DESCRIPTION = "Linux Kernel for DaVinci Trik linux"
LICENSE = "GPLv2"
KERNEL_IMAGETYPE = "uImage"
KERNEL_VERSION ="3.6.7"


#require recipes-kernel/linux/multi-kernel.inc
#require recipes-kernel/linux/tipspkernel.inc

MULTI_CONFIG_BASE_SUFFIX = ""

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/trikset/trik-linux.git;branch=trik-linux-3.6.7 \
	   file://defconfig"
S = "${WORKDIR}/git"

LIC_FILES_CHKSUM="file://COPYING;beginline=1;endline=355;md5=bad9197b13faffd10dfc69bd78fd072e"

#do_fetch[no_exec] ="1"
