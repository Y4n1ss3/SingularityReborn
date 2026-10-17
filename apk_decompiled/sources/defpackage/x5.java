package defpackage;

import android.graphics.Typeface;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class x5 implements oy {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x5(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.oy
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Typeface _init_$lambda$0;
        w01 _init_$lambda$1;
        int i = this.d;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                _init_$lambda$0 = AndroidParagraphIntrinsics._init_$lambda$0((AndroidParagraphIntrinsics) obj5, (FontFamily) obj, (FontWeight) obj2, (FontStyle) obj3, (FontSynthesis) obj4);
                return _init_$lambda$0;
            default:
                _init_$lambda$1 = SelectionManager._init_$lambda$1((SelectionManager) obj5, ((Boolean) obj).booleanValue(), (LayoutCoordinates) obj2, (Offset) obj3, (SelectionAdjustment) obj4);
                return _init_$lambda$1;
        }
    }
}
