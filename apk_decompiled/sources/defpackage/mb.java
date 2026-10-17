package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class mb implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Alignment.Horizontal e;

    public /* synthetic */ mb(Alignment.Horizontal horizontal, int i) {
        this.d = i;
        this.e = horizontal;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int spacedBy_D5KLDUw$lambda$0;
        int aligned$lambda$0;
        int aligned$lambda$02;
        int spacedBy_D5KLDUw$lambda$02;
        IntOffset width$lambda$0;
        int i = this.d;
        Alignment.Horizontal horizontal = this.e;
        switch (i) {
            case 0:
                spacedBy_D5KLDUw$lambda$0 = Arrangement.spacedBy_D5KLDUw$lambda$0(horizontal, ((Integer) obj).intValue(), (LayoutDirection) obj2);
                return Integer.valueOf(spacedBy_D5KLDUw$lambda$0);
            case 1:
                aligned$lambda$0 = Arrangement.aligned$lambda$0(horizontal, ((Integer) obj).intValue(), (LayoutDirection) obj2);
                return Integer.valueOf(aligned$lambda$0);
            case 2:
                aligned$lambda$02 = Arrangement.Absolute.aligned$lambda$0(horizontal, ((Integer) obj).intValue(), (LayoutDirection) obj2);
                return Integer.valueOf(aligned$lambda$02);
            case 3:
                spacedBy_D5KLDUw$lambda$02 = Arrangement.Absolute.spacedBy_D5KLDUw$lambda$0(horizontal, ((Integer) obj).intValue(), (LayoutDirection) obj2);
                return Integer.valueOf(spacedBy_D5KLDUw$lambda$02);
            default:
                width$lambda$0 = WrapContentElement.Companion.width$lambda$0(horizontal, (IntSize) obj, (LayoutDirection) obj2);
                return width$lambda$0;
        }
    }
}
