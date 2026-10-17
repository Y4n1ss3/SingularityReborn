package androidx.compose.runtime;

import defpackage.er;
import defpackage.k4;
import defpackage.ky;
import defpackage.l30;
import defpackage.my;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Updater<T> {
    private final Composer composer;

    private /* synthetic */ Updater(Composer composer) {
        this.composer = composer;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Updater m3877boximpl(Composer composer) {
        return new Updater(composer);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3879equalsimpl(Composer composer, Object obj) {
        return (obj instanceof Updater) && q10.b(composer, ((Updater) obj).m3890unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3880equalsimpl0(Composer composer, Composer composer2) {
        return q10.b(composer, composer2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3881hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* renamed from: init-impl, reason: not valid java name */
    public static final void m3883initimpl(Composer composer, ky kyVar) {
        if (composer.getInserting()) {
            composer.apply(w01.a, new l30(kyVar, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 init_impl$lambda$0(ky kyVar, Object obj, w01 w01Var) {
        kyVar.invoke(obj);
        return w01.a;
    }

    /* renamed from: reconcile-impl, reason: not valid java name */
    public static final void m3884reconcileimpl(Composer composer, ky kyVar) {
        composer.apply(w01.a, new l30(kyVar, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 reconcile_impl$lambda$0(ky kyVar, Object obj, w01 w01Var) {
        kyVar.invoke(obj);
        return w01.a;
    }

    @er
    /* renamed from: set-impl, reason: not valid java name */
    public static final /* synthetic */ void m3885setimpl(Composer composer, int i, my myVar) {
        if (composer.getInserting() || !q10.b(composer.rememberedValue(), Integer.valueOf(i))) {
            k4.j(myVar, i, composer, i);
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3887toStringimpl(Composer composer) {
        return "Updater(composer=" + composer + ')';
    }

    @er
    /* renamed from: update-impl, reason: not valid java name */
    public static final /* synthetic */ void m3888updateimpl(Composer composer, int i, my myVar) {
        boolean inserting = composer.getInserting();
        if (inserting || !q10.b(composer.rememberedValue(), Integer.valueOf(i))) {
            composer.updateRememberedValue(Integer.valueOf(i));
            if (inserting) {
                return;
            }
            composer.apply(Integer.valueOf(i), myVar);
        }
    }

    public boolean equals(Object obj) {
        return m3879equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m3881hashCodeimpl(this.composer);
    }

    public String toString() {
        return m3887toStringimpl(this.composer);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Composer m3890unboximpl() {
        return this.composer;
    }

    public static /* synthetic */ void getComposer$annotations() {
    }

    /* renamed from: init-impl, reason: not valid java name */
    public static final <V> void m3882initimpl(Composer composer, V v, my myVar) {
        if (composer.getInserting()) {
            composer.apply(v, myVar);
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Composer m3878constructorimpl(Composer composer) {
        return composer;
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final <V> void m3886setimpl(Composer composer, V v, my myVar) {
        if (composer.getInserting() || !q10.b(composer.rememberedValue(), v)) {
            composer.updateRememberedValue(v);
            composer.apply(v, myVar);
        }
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final <V> void m3889updateimpl(Composer composer, V v, my myVar) {
        boolean inserting = composer.getInserting();
        if (inserting || !q10.b(composer.rememberedValue(), v)) {
            composer.updateRememberedValue(v);
            if (inserting) {
                return;
            }
            composer.apply(v, myVar);
        }
    }
}
