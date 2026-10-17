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
import defpackage.af0;
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BeenhereKt {
    private static ImageVector _beenhere;

    public static final ImageVector getBeenhere(Icons.Outlined outlined) {
        ImageVector imageVector = _beenhere;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Beenhere", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.0f, 1.0f, 5.0f, 1.0f);
        i.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        i.lineTo(3.0f, 15.93f);
        i.curveToRelative(0.0f, 0.69f, 0.35f, 1.3f, 0.88f, 1.66f);
        i.lineTo(12.0f, 23.0f);
        i.lineToRelative(8.11f, -5.41f);
        i.curveToRelative(0.53f, -0.36f, 0.88f, -0.97f, 0.88f, -1.66f);
        i.lineTo(21.0f, 3.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.x(i, 12.0f, 20.6f, -7.0f, -4.66f);
        fc.w(i, 5.0f, 3.0f, 14.0f, 12.93f);
        fc.B(i, -7.0f, 4.67f, 9.99f, 13.18f);
        i.lineToRelative(-2.58f, -2.59f);
        i.lineTo(6.0f, 12.0f);
        i.lineToRelative(4.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(i, 8.0f, -8.0f, -1.42f, -1.42f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _beenhere = build;
        build.getClass();
        return build;
    }
}
