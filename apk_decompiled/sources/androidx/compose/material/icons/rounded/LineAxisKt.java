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
public final class LineAxisKt {
    private static ImageVector _lineAxis;

    public static final ImageVector getLineAxis(Icons.Rounded rounded) {
        ImageVector imageVector = _lineAxis;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LineAxis", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.34f, 6.77f, 21.34f, 6.77f);
        i.curveToRelative(-0.4f, -0.4f, -1.07f, -0.39f, -1.45f, 0.04f);
        i.lineToRelative(-3.33f, 3.74f);
        i.lineToRelative(-5.65f, -5.24f);
        i.curveTo(10.12f, 4.58f, 8.9f, 4.6f, 8.14f, 5.36f);
        i.lineTo(2.7f, 10.81f);
        i.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        i.lineToRelative(0.09f, 0.09f);
        i.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        i.lineToRelative(5.44f, -5.45f);
        i.lineToRelative(5.59f, 5.19f);
        i.lineToRelative(-1.73f, 1.95f);
        i.lineToRelative(-2.58f, -2.58f);
        i.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        i.lineTo(2.7f, 16.8f);
        i.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        i.lineTo(2.8f, 18.3f);
        i.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        i.lineToRelative(5.3f, -5.3f);
        i.lineToRelative(2.5f, 2.5f);
        i.curveToRelative(0.81f, 0.81f, 2.14f, 0.77f, 2.91f, -0.09f);
        i.lineToRelative(1.78f, -2.01f);
        i.lineToRelative(3.19f, 2.96f);
        i.curveToRelative(0.39f, 0.36f, 1.0f, 0.35f, 1.38f, -0.03f);
        i.lineToRelative(0.01f, -0.01f);
        i.curveToRelative(0.4f, -0.4f, 0.39f, -1.05f, -0.03f, -1.43f);
        i.lineToRelative(-3.22f, -2.99f);
        i.lineToRelative(3.35f, -3.77f);
        i.curveTo(21.73f, 7.74f, 21.71f, 7.14f, 21.34f, 6.77f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _lineAxis = build;
        build.getClass();
        return build;
    }
}
