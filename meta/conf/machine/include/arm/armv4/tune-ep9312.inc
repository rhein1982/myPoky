DEFAULTTUNE ?= "ep9312"

require conf/machine/include/arm/arch-armv4.inc

TUNEVALID[ep9312] = "Enable Cirrus Logic EP9312 specific processor optimizations"
TUNE_CCARGS .= "${@bb.utils.contains('TUNE_FEATURES', 'ep9312', ' -march=ep9312 -mcpu=ep9312', '', d)}"
MACHINEOVERRIDES =. "${@bb.utils.contains('TUNE_FEATURES', 'ep9312', 'armv4:', '', d)}"

AVAILTUNES += "ep9312"
ARMPKGARCH:tune-ep9312 = "ep9312"
TUNE_FEATURES:tune-ep9312 = "thumb ep9312"
PACKAGE_EXTRA_ARCHS:tune-ep9312 = "${PACKAGE_EXTRA_ARCHS:tune-armv4t} ep9312t"
