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
import defpackage.fc;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SentimentVerySatisfiedKt {
    private static ImageVector _sentimentVerySatisfied;

    public static final ImageVector getSentimentVerySatisfied(Icons.Rounded rounded) {
        ImageVector imageVector = _sentimentVerySatisfied;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SentimentVerySatisfied", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(8.88f, 9.94f, 0.53f, 0.53f);
        e.curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0.0f);
        e.curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0.0f, -1.06f);
        e.lineToRelative(-0.88f, -0.88f);
        e.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        e.lineToRelative(-0.89f, 0.88f);
        e.curveToRelative(-0.29f, 0.29f, -0.29f, 0.77f, 0.0f, 1.06f);
        e.curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0.0f);
        fc.B(e, 0.53f, -0.53f, 12.0f, 17.5f);
        e.curveToRelative(2.03f, 0.0f, 3.8f, -1.11f, 4.75f, -2.75f);
        e.curveToRelative(0.19f, -0.33f, -0.05f, -0.75f, -0.44f, -0.75f);
        e.lineTo(7.69f, 14.0f);
        e.curveToRelative(-0.38f, 0.0f, -0.63f, 0.42f, -0.44f, 0.75f);
        e.curveToRelative(0.95f, 1.64f, 2.72f, 2.75f, 4.75f, 2.75f);
        e.close();
        e.moveTo(13.53f, 10.47f);
        e.curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0.0f);
        e.lineToRelative(0.53f, -0.53f);
        e.lineToRelative(0.53f, 0.53f);
        e.curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0.0f);
        e.curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0.0f, -1.06f);
        e.lineToRelative(-0.88f, -0.88f);
        e.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        e.lineToRelative(-0.88f, 0.88f);
        e.curveToRelative(-0.3f, 0.29f, -0.3f, 0.77f, -0.01f, 1.06f);
        e.close();
        e.moveTo(11.99f, 2.0f);
        e.curveTo(6.47f, 2.0f, 2.0f, 6.47f, 2.0f, 12.0f);
        e.reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f);
        e.reflectiveCurveTo(22.0f, 17.53f, 22.0f, 12.0f);
        e.reflectiveCurveTo(17.52f, 2.0f, 11.99f, 2.0f);
        e.close();
        e.moveTo(12.0f, 20.0f);
        e.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        e.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
        e.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(e, -3.58f, 8.0f, -8.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sentimentVerySatisfied = build;
        build.getClass();
        return build;
    }
}
