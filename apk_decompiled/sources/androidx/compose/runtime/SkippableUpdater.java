package androidx.compose.runtime;

import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SkippableUpdater<T> {
    private final Composer composer;

    private /* synthetic */ SkippableUpdater(Composer composer) {
        this.composer = composer;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SkippableUpdater m3851boximpl(Composer composer) {
        return new SkippableUpdater(composer);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3853equalsimpl(Composer composer, Object obj) {
        return (obj instanceof SkippableUpdater) && q10.b(composer, ((SkippableUpdater) obj).m3858unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3854equalsimpl0(Composer composer, Composer composer2) {
        return q10.b(composer, composer2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3855hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3856toStringimpl(Composer composer) {
        return "SkippableUpdater(composer=" + composer + ')';
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final void m3857updateimpl(Composer composer, ky kyVar) {
        composer.startReplaceableGroup(509942095);
        kyVar.invoke(Updater.m3877boximpl(Updater.m3878constructorimpl(composer)));
        composer.endReplaceableGroup();
    }

    public boolean equals(Object obj) {
        return m3853equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m3855hashCodeimpl(this.composer);
    }

    public String toString() {
        return m3856toStringimpl(this.composer);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Composer m3858unboximpl() {
        return this.composer;
    }

    public static /* synthetic */ void getComposer$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Composer m3852constructorimpl(Composer composer) {
        return composer;
    }
}
