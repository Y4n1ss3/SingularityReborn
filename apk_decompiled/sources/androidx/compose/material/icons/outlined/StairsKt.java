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
import defpackage.gy;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StairsKt {
    private static ImageVector _stairs;

    public static final ImageVector getStairs(Icons.Outlined outlined) {
        ImageVector imageVector = _stairs;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Stairs", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = kp0.y(19.0f, 5.0f, 14.0f, 5.0f, 5.0f);
        r6.z(y, 19.0f, 19.0f, 3.0f, 5.0f);
        y.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        y.verticalLineToRelative(14.0f);
        y.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        y.horizontalLineToRelative(14.0f);
        y.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        y.verticalLineTo(5.0f);
        y.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        uo.l(y, 19.0f, 3.0f, 18.0f, 6.0f);
        af0.z(y, -4.42f, 3.33f, 11.0f, 3.33f);
        gy.x(y, 8.42f, 16.0f, 6.0f, 2.0f);
        af0.z(y, 4.42f, -3.33f, 13.0f, -3.33f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.l(y, 2.58f, 8.0f, 18.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stairs = build;
        build.getClass();
        return build;
    }
}
