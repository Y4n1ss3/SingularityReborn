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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SkipPreviousKt {
    private static ImageVector _skipPrevious;

    public static final ImageVector getSkipPrevious(Icons.Rounded rounded) {
        ImageVector imageVector = _skipPrevious;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SkipPrevious", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(7.0f, 6.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.verticalLineToRelative(10.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        b.lineTo(6.0f, 7.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        k4.x(b, 10.66f, 12.82f, 5.77f, 4.07f);
        b.curveToRelative(0.66f, 0.47f, 1.58f, -0.01f, 1.58f, -0.82f);
        b.lineTo(18.01f, 7.93f);
        b.curveToRelative(0.0f, -0.81f, -0.91f, -1.28f, -1.58f, -0.82f);
        b.lineToRelative(-5.77f, 4.07f);
        b.curveToRelative(-0.57f, 0.4f, -0.57f, 1.24f, 0.0f, 1.64f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _skipPrevious = build;
        build.getClass();
        return build;
    }
}
