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
public final class HighlightKt {
    private static ImageVector _highlight;

    public static final ImageVector getHighlight(Icons.Rounded rounded) {
        ImageVector imageVector = _highlight;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Highlight", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(6.29f, 14.29f, 9.0f, 17.0f, 4.0f);
        s.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        s.horizontalLineToRelative(4.0f);
        s.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        s.verticalLineToRelative(-4.0f);
        s.lineToRelative(2.71f, -2.71f);
        s.curveToRelative(0.19f, -0.19f, 0.29f, -0.44f, 0.29f, -0.71f);
        s.lineTo(18.0f, 10.0f);
        s.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        s.lineTo(7.0f, 9.0f);
        s.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        s.verticalLineToRelative(3.59f);
        s.curveToRelative(0.0f, 0.26f, 0.11f, 0.52f, 0.29f, 0.7f);
        s.close();
        s.moveTo(12.0f, 2.0f);
        s.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        s.verticalLineToRelative(1.0f);
        s.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        s.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        s.lineTo(11.0f, 3.0f);
        s.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        s.close();
        s.moveTo(4.21f, 5.17f);
        s.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.42f, 0.0f);
        s.lineToRelative(0.71f, 0.71f);
        s.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        s.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        s.lineToRelative(-0.72f, -0.71f);
        s.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        k4.x(s, 17.67f, 5.88f, 0.71f, -0.71f);
        s.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        s.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        s.lineToRelative(-0.71f, 0.71f);
        s.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        s.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        s.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, s.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _highlight = build;
        build.getClass();
        return build;
    }
}
