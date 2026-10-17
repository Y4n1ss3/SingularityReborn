package defpackage;

import androidx.compose.ui.graphics.Matrix;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class z60 extends us0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ ky e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z60(int i, hm hmVar, ky kyVar) {
        super(2, hmVar);
        this.d = i;
        this.e = kyVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        ky kyVar = this.e;
        switch (i) {
            case 0:
                return new z60(0, hmVar, kyVar);
            case 1:
                return new z60(1, hmVar, kyVar);
            case 2:
                return new z60(2, hmVar, kyVar);
            case 3:
                return new z60(3, hmVar, kyVar);
            case 4:
                return new z60(4, hmVar, kyVar);
            case 5:
                return new z60(5, hmVar, kyVar);
            case 6:
                return new z60(6, hmVar, kyVar);
            case 7:
                return new z60(7, hmVar, kyVar);
            case 8:
                return new z60(8, hmVar, kyVar);
            case 9:
                return new z60(9, hmVar, kyVar);
            case 10:
                return new z60(10, hmVar, kyVar);
            case 11:
                return new z60(11, hmVar, kyVar);
            case Matrix.TranslateX /* 12 */:
                return new z60(12, hmVar, kyVar);
            case Matrix.TranslateY /* 13 */:
                return new z60(13, hmVar, kyVar);
            case Matrix.TranslateZ /* 14 */:
                return new z60(14, hmVar, kyVar);
            default:
                return new z60(15, hmVar, kyVar);
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        un unVar = (un) obj;
        hm hmVar = (hm) obj2;
        switch (i) {
            case 0:
                ((z60) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            case 1:
                ((z60) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            case 2:
                ((z60) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            case 3:
                ((z60) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            case 4:
                ((z60) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            case 5:
                ((z60) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            case 6:
                ((z60) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            case 7:
                ((z60) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            case 8:
                ((z60) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            case 9:
                ((z60) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            case 10:
                ((z60) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            case 11:
                ((z60) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            case Matrix.TranslateX /* 12 */:
                ((z60) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            case Matrix.TranslateY /* 13 */:
                ((z60) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            case Matrix.TranslateZ /* 14 */:
                ((z60) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            default:
                ((z60) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
        }
        return w01Var;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        ky kyVar = this.e;
        switch (i) {
            case 0:
                p10.Q(obj);
                kyVar.invoke(null);
                break;
            case 1:
                p10.Q(obj);
                kyVar.invoke(null);
                break;
            case 2:
                p10.Q(obj);
                kyVar.invoke("System fan control restored");
                break;
            case 3:
                p10.Q(obj);
                kyVar.invoke("Controller Fix Applied");
                break;
            case 4:
                p10.Q(obj);
                kyVar.invoke("Failed to apply boot animation");
                break;
            case 5:
                p10.Q(obj);
                kyVar.invoke("CPU Min Freq lock started");
                break;
            case 6:
                p10.Q(obj);
                kyVar.invoke("CPU Min Freq lock stopped");
                break;
            case 7:
                p10.Q(obj);
                kyVar.invoke("CPU Max Freq lock started");
                break;
            case 8:
                p10.Q(obj);
                kyVar.invoke("CPU Max Freq lock stopped");
                break;
            case 9:
                p10.Q(obj);
                kyVar.invoke("GPU Min Freq lock started");
                break;
            case 10:
                p10.Q(obj);
                kyVar.invoke("GPU Min Freq lock stopped");
                break;
            case 11:
                p10.Q(obj);
                kyVar.invoke("GPU Max Freq lock stopped");
                break;
            case Matrix.TranslateX /* 12 */:
                p10.Q(obj);
                kyVar.invoke("Telemetry Disabled");
                break;
            case Matrix.TranslateY /* 13 */:
                p10.Q(obj);
                kyVar.invoke("Telemetry Enabled");
                break;
            case Matrix.TranslateZ /* 14 */:
                p10.Q(obj);
                kyVar.invoke("Update Engine Disabled");
                break;
            default:
                p10.Q(obj);
                kyVar.invoke("Update Engine Enabled");
                break;
        }
        return w01Var;
    }
}
