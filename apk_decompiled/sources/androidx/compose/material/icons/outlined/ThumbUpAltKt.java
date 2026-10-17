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
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ThumbUpAltKt {
    private static ImageVector _thumbUpAlt;

    public static final ImageVector getThumbUpAlt(Icons.Outlined outlined) {
        ImageVector imageVector = _thumbUpAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ThumbUpAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(21.0f, 8.0f, -6.31f, 0.95f, -4.57f);
        i.lineToRelative(0.03f, -0.32f);
        i.curveToRelative(0.0f, -0.41f, -0.17f, -0.79f, -0.44f, -1.06f);
        i.lineTo(14.17f, 1.0f);
        i.lineTo(7.59f, 7.59f);
        i.curveTo(7.22f, 7.95f, 7.0f, 8.45f, 7.0f, 9.0f);
        i.verticalLineToRelative(10.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(9.0f);
        i.curveToRelative(0.83f, 0.0f, 1.54f, -0.5f, 1.84f, -1.22f);
        i.lineToRelative(3.02f, -7.05f);
        i.curveToRelative(0.09f, -0.23f, 0.14f, -0.47f, 0.14f, -0.73f);
        i.verticalLineToRelative(-2.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.x(i, 21.0f, 12.0f, -3.0f, 7.0f);
        i.lineTo(9.0f, 19.0f);
        i.lineTo(9.0f, 9.0f);
        i.lineToRelative(4.34f, -4.34f);
        i.lineTo(12.23f, 10.0f);
        bv.r(i, 21.0f, 10.0f, 2.0f);
        k4.C(i, 1.0f, 9.0f, 4.0f, 12.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 1.0f, 21.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbUpAlt = build;
        build.getClass();
        return build;
    }
}
