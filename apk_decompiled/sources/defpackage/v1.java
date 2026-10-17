package defpackage;

import android.content.Intent;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class v1 extends y80 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1(int i) {
        super(6);
        this.m = i;
    }

    @Override // defpackage.y80
    public final Object H(int i, Intent intent) {
        switch (this.m) {
            case 0:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            case 1:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            default:
                return new t1(i, intent);
        }
    }

    @Override // defpackage.y80
    public final Intent n(vu0 vu0Var, Object obj) {
        switch (this.m) {
            case 0:
                Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType((String) obj);
                type.getClass();
                return type;
            case 1:
                Intent type2 = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", (String[]) obj).setType("*/*");
                type2.getClass();
                return type2;
            default:
                return (Intent) obj;
        }
    }

    @Override // defpackage.y80
    public void y(vu0 vu0Var, Object obj) {
        switch (this.m) {
            case 0:
                break;
            case 1:
                break;
        }
    }
}
