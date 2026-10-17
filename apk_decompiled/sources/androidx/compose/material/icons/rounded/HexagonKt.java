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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HexagonKt {
    private static ImageVector _hexagon;

    public static final ImageVector getHexagon(Icons.Rounded rounded) {
        ImageVector imageVector = _hexagon;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Hexagon", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(16.05f, 3.0f, 7.95f);
        d.curveTo(7.24f, 3.0f, 6.58f, 3.38f, 6.22f, 4.0f);
        d.lineToRelative(-4.04f, 7.0f);
        d.curveToRelative(-0.36f, 0.62f, -0.36f, 1.38f, 0.0f, 2.0f);
        d.lineToRelative(4.04f, 7.0f);
        d.curveToRelative(0.36f, 0.62f, 1.02f, 1.0f, 1.73f, 1.0f);
        d.horizontalLineToRelative(8.09f);
        d.curveToRelative(0.71f, 0.0f, 1.37f, -0.38f, 1.73f, -1.0f);
        d.lineToRelative(4.04f, -7.0f);
        d.curveToRelative(0.36f, -0.62f, 0.36f, -1.38f, 0.0f, -2.0f);
        d.lineToRelative(-4.04f, -7.0f);
        d.curveTo(17.42f, 3.38f, 16.76f, 3.0f, 16.05f, 3.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hexagon = build;
        build.getClass();
        return build;
    }
}
