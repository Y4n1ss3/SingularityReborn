package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class y1 extends p01 {
    public final /* synthetic */ int g;
    public final /* synthetic */ String h;
    public final /* synthetic */ yj i;
    public final /* synthetic */ y80 j;

    public /* synthetic */ y1(yj yjVar, String str, y80 y80Var, int i) {
        this.g = i;
        this.i = yjVar;
        this.h = str;
        this.j = y80Var;
    }

    public final void J(Object obj) {
        int i = this.g;
        String str = this.h;
        yj yjVar = this.i;
        y80 y80Var = this.j;
        switch (i) {
            case 0:
                v1 v1Var = (v1) y80Var;
                Integer num = (Integer) yjVar.b.get(str);
                if (num != null) {
                    yjVar.d.add(str);
                    try {
                        yjVar.b(num.intValue(), v1Var, obj);
                        return;
                    } catch (Exception e) {
                        yjVar.d.remove(str);
                        throw e;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + v1Var + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            default:
                Integer num2 = (Integer) yjVar.b.get(str);
                if (num2 != null) {
                    yjVar.d.add(str);
                    try {
                        yjVar.b(num2.intValue(), y80Var, obj);
                        return;
                    } catch (Exception e2) {
                        yjVar.d.remove(str);
                        throw e2;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + y80Var + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }
}
