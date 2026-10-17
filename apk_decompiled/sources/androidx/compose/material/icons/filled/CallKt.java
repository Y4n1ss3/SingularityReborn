package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CallKt {
    private static ImageVector _call;

    public static final ImageVector getCall(Icons.Filled filled) {
        ImageVector imageVector = _call;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Call", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.01f, 15.38f);
        b.curveToRelative(-1.23f, 0.0f, -2.42f, -0.2f, -3.53f, -0.56f);
        b.curveToRelative(-0.35f, -0.12f, -0.74f, -0.03f, -1.01f, 0.24f);
        b.lineToRelative(-1.57f, 1.97f);
        b.curveToRelative(-2.83f, -1.35f, -5.48f, -3.9f, -6.89f, -6.83f);
        b.lineToRelative(1.95f, -1.66f);
        b.curveToRelative(0.27f, -0.28f, 0.35f, -0.67f, 0.24f, -1.02f);
        b.curveToRelative(-0.37f, -1.11f, -0.56f, -2.3f, -0.56f, -3.53f);
        b.curveToRelative(0.0f, -0.54f, -0.45f, -0.99f, -0.99f, -0.99f);
        b.horizontalLineTo(4.19f);
        b.curveTo(3.65f, 3.0f, 3.0f, 3.24f, 3.0f, 3.99f);
        b.curveTo(3.0f, 13.28f, 10.73f, 21.0f, 20.01f, 21.0f);
        b.curveToRelative(0.71f, 0.0f, 0.99f, -0.63f, 0.99f, -1.18f);
        b.verticalLineToRelative(-3.45f);
        b.curveToRelative(0.0f, -0.54f, -0.45f, -0.99f, -0.99f, -0.99f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _call = build;
        build.getClass();
        return build;
    }
}
