package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ie {
    public static final ie f;
    public static final ie g;
    public static final ie h;
    public static final /* synthetic */ ie[] i;
    public static final /* synthetic */ cu j;
    public final String d;
    public final String e;

    static {
        ie ieVar = new ie(0, "BLACKHOLE", "singularity-blackhole.glb", "Blackhole");
        f = ieVar;
        ie ieVar2 = new ie(1, "OCULUS_LOGO", "oculus-logo.glb", "Oculus Logo");
        g = ieVar2;
        ie ieVar3 = new ie(2, "CUSTOM", "", "Custom");
        h = ieVar3;
        ie[] ieVarArr = {ieVar, ieVar2, ieVar3};
        i = ieVarArr;
        j = new cu(ieVarArr);
    }

    public ie(int i2, String str, String str2, String str3) {
        this.d = str2;
        this.e = str3;
    }

    public static ie valueOf(String str) {
        return (ie) Enum.valueOf(ie.class, str);
    }

    public static ie[] values() {
        return (ie[]) i.clone();
    }
}
