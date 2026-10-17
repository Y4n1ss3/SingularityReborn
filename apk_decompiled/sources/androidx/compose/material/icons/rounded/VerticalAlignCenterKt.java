package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VerticalAlignCenterKt {
    private static ImageVector _verticalAlignCenter;

    public static final ImageVector getVerticalAlignCenter(Icons.Rounded rounded) {
        ImageVector imageVector = _verticalAlignCenter;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.VerticalAlignCenter", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(9.21f, 19.0f, 11.0f, 19.0f, 3.0f);
        s.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        s.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        s.verticalLineToRelative(-3.0f);
        s.horizontalLineToRelative(1.79f);
        s.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        s.lineToRelative(-2.79f, -2.79f);
        s.curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f);
        s.lineToRelative(-2.79f, 2.79f);
        s.curveToRelative(-0.31f, 0.31f, -0.09f, 0.85f, 0.36f, 0.85f);
        k4.r(s, 14.79f, 5.0f, 13.0f, 5.0f);
        s.lineTo(13.0f, 2.0f);
        s.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        s.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        s.verticalLineToRelative(3.0f);
        s.lineTo(9.21f, 5.0f);
        s.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.36f, 0.85f);
        s.lineToRelative(2.79f, 2.79f);
        s.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        s.lineToRelative(2.79f, -2.79f);
        s.curveToRelative(0.32f, -0.31f, 0.1f, -0.85f, -0.35f, -0.85f);
        s.close();
        s.moveTo(4.0f, 12.0f);
        s.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        s.horizontalLineToRelative(14.0f);
        s.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        s.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        s.lineTo(5.0f, 11.0f);
        s.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        s.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, s.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _verticalAlignCenter = build;
        build.getClass();
        return build;
    }
}
