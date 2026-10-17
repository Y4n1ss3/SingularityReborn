package androidx.compose.material.icons.sharp;

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
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SentimentVerySatisfiedKt {
    private static ImageVector _sentimentVerySatisfied;

    public static final ImageVector getSentimentVerySatisfied(Icons.Sharp sharp) {
        ImageVector imageVector = _sentimentVerySatisfied;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SentimentVerySatisfied", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(8.88f, 9.94f, 9.94f, 11.0f);
        i.lineTo(11.0f, 9.94f);
        i.lineTo(8.88f, 7.82f);
        r6.C(i, 6.76f, 9.94f, 7.82f, 11.0f);
        i.moveTo(12.0f, 17.5f);
        i.curveToRelative(2.33f, 0.0f, 4.31f, -1.46f, 5.11f, -3.5f);
        i.lineTo(6.89f, 14.0f);
        i.curveToRelative(0.8f, 2.04f, 2.78f, 3.5f, 5.11f, 3.5f);
        k4.r(i, 13.0f, 9.94f, 14.06f, 11.0f);
        i.lineToRelative(1.06f, -1.06f);
        i.lineTo(16.18f, 11.0f);
        fc.C(i, 1.06f, -1.06f, -2.12f, -2.12f);
        i.moveTo(11.99f, 2.0f);
        i.curveTo(6.47f, 2.0f, 2.0f, 6.47f, 2.0f, 12.0f);
        i.reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f);
        i.reflectiveCurveTo(22.0f, 17.53f, 22.0f, 12.0f);
        i.reflectiveCurveTo(17.52f, 2.0f, 11.99f, 2.0f);
        i.close();
        i.moveTo(12.0f, 20.0f);
        i.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        i.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
        i.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, -3.58f, 8.0f, -8.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sentimentVerySatisfied = build;
        build.getClass();
        return build;
    }
}
