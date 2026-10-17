package defpackage;

import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.MapSaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class s50 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ my e;

    public /* synthetic */ s50(int i, my myVar) {
        this.d = i;
        this.e = myVar;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        Object listSaver$lambda$0;
        List mapSaver$lambda$0;
        int i = this.d;
        my myVar = this.e;
        SaverScope saverScope = (SaverScope) obj;
        switch (i) {
            case 0:
                listSaver$lambda$0 = ListSaverKt.listSaver$lambda$0(myVar, saverScope, obj2);
                return listSaver$lambda$0;
            default:
                mapSaver$lambda$0 = MapSaverKt.mapSaver$lambda$0(myVar, saverScope, obj2);
                return mapSaver$lambda$0;
        }
    }
}
