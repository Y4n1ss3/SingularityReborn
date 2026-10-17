package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Placeable;
import defpackage.ky;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 invoke$lambda$0;
        w01 measure_3p2s80s$lambda$0;
        w01 measure_3p2s80s$lambda$3;
        int i = this.d;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                invoke$lambda$0 = ClickableTextKt$ClickableText$pressIndicator$1$1.invoke$lambda$0((MutableState) obj3, (ky) obj2, (Offset) obj);
                return invoke$lambda$0;
            case 1:
                measure_3p2s80s$lambda$0 = LinksTextMeasurePolicy.measure_3p2s80s$lambda$0((List) obj3, (LinksTextMeasurePolicy) obj2, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$0;
            default:
                measure_3p2s80s$lambda$3 = TextMeasurePolicy.measure_3p2s80s$lambda$3((List) obj3, (List) obj2, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$3;
        }
    }
}
