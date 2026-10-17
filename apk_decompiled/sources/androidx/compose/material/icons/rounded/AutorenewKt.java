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
import defpackage.af0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AutorenewKt {
    private static ImageVector _autorenew;

    public static final ImageVector getAutorenew(Icons.Rounded rounded) {
        ImageVector imageVector = _autorenew;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Autorenew", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(12.0f, 6.0f, 1.79f);
        h.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        h.lineToRelative(2.79f, -2.79f);
        h.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        h.lineToRelative(-2.79f, -2.79f);
        h.curveToRelative(-0.31f, -0.31f, -0.85f, -0.09f, -0.85f, 0.36f);
        h.lineTo(12.0f, 4.0f);
        h.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        h.curveToRelative(0.0f, 1.04f, 0.2f, 2.04f, 0.57f, 2.95f);
        h.curveToRelative(0.27f, 0.67f, 1.13f, 0.85f, 1.64f, 0.34f);
        h.curveToRelative(0.27f, -0.27f, 0.38f, -0.68f, 0.23f, -1.04f);
        h.curveTo(6.15f, 13.56f, 6.0f, 12.79f, 6.0f, 12.0f);
        h.curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
        h.close();
        h.moveTo(17.79f, 8.71f);
        h.curveToRelative(-0.27f, 0.27f, -0.38f, 0.69f, -0.23f, 1.04f);
        h.curveToRelative(0.28f, 0.7f, 0.44f, 1.46f, 0.44f, 2.25f);
        h.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        h.verticalLineToRelative(-1.79f);
        h.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        h.lineToRelative(-2.79f, 2.79f);
        h.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        h.lineToRelative(2.79f, 2.79f);
        h.curveToRelative(0.31f, 0.31f, 0.85f, 0.09f, 0.85f, -0.35f);
        h.lineTo(12.0f, 20.0f);
        h.curveToRelative(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f);
        h.curveToRelative(0.0f, -1.04f, -0.2f, -2.04f, -0.57f, -2.95f);
        h.curveToRelative(-0.27f, -0.67f, -1.13f, -0.85f, -1.64f, -0.34f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autorenew = build;
        build.getClass();
        return build;
    }
}
