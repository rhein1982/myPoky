DESCRIPTION = "Data synchronization tool"
SRC_URI = "git://git.moblin.org/${PN}.git;protocol=git"
LICENSE = "LGPLv2.1"
PV = "0.0+git${SRCPV}"
PR = "r0"

DEPENDS = "libsynthesis libsoup curl boost mux dbus-glib glib-2.0 libglade libunique"

EXTRA_OECONF = "--enable-gui=moblin"

S = "${WORKDIR}/git"

inherit autotools_stage

do_configure_prepend () {
    ${S}/gen-autotools.sh
}