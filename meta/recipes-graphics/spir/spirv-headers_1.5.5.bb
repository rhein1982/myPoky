SUMMARY = "Machine-readable files for the SPIR-V Registry"
DESCRIPTION = "Headers are provided in the include directory, with up-to-date \
headers in the unified1 subdirectory. Older headers are provided according to \
their version."
SECTION = "graphics"
HOMEPAGE = "https://www.khronos.org/registry/spir-v"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c938b85bceb8fb26c1a807f28a52ae2d"

SRCREV = "c8213b3c5a2cf3a0f5c4d1e7d7b8fc2ac9f4806d"
SRC_URI = "git://github.com/KhronosGroup/SPIRV-Headers;protocol=https;branch=master"
UPSTREAM_CHECK_GITTAGREGEX = "^(?P<pver>\d+(\.\d+)+)$"
S = "${WORKDIR}/git"
PV .= "+git${SRCPV}"

inherit cmake

BBCLASSEXTEND = "native nativesdk"