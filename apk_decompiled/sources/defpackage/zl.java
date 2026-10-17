package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class zl implements un {
    public final kn d;

    public zl(kn knVar) {
        this.d = knVar;
    }

    @Override // defpackage.un
    public final kn getCoroutineContext() {
        return this.d;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.d + ')';
    }
}
