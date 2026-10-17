package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SignalCellularNodataKt {
    private static ImageVector _signalCellularNodata;

    public static final ImageVector getSignalCellularNodata(Icons.Outlined outlined) {
        ImageVector imageVector = _signalCellularNodata;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SignalCellularNodata", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = gy.d(22.0f, 13.0f, -9.0f, 9.0f, 2.0f);
        uf.o(d, 22.0f, 2.0f, 13.0f);
        d.moveTo(21.0f, 15.41f);
        d.lineTo(19.59f, 14.0f);
        d.lineToRelative(-2.09f, 2.09f);
        d.lineTo(15.41f, 14.0f);
        d.lineTo(14.0f, 15.41f);
        d.lineToRelative(2.09f, 2.09f);
        d.lineTo(14.0f, 19.59f);
        d.lineTo(15.41f, 21.0f);
        d.lineToRelative(2.09f, -2.08f);
        d.lineTo(19.59f, 21.0f);
        d.lineTo(21.0f, 19.59f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(d, -2.08f, -2.09f, 21.0f, 15.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signalCellularNodata = build;
        build.getClass();
        return build;
    }
}
