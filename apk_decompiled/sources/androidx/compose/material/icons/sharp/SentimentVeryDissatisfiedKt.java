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
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SentimentVeryDissatisfiedKt {
    private static ImageVector _sentimentVeryDissatisfied;

    public static final ImageVector getSentimentVeryDissatisfied(Icons.Sharp sharp) {
        ImageVector imageVector = _sentimentVeryDissatisfied;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SentimentVeryDissatisfied", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 13.5f);
        b.curveToRelative(-2.33f, 0.0f, -4.31f, 1.46f, -5.11f, 3.5f);
        b.horizontalLineToRelative(10.22f);
        b.curveToRelative(-0.8f, -2.04f, -2.78f, -3.5f, -5.11f, -3.5f);
        k4.x(b, 7.82f, 12.0f, 1.06f, -1.06f);
        b.lineTo(9.94f, 12.0f);
        b.lineTo(11.0f, 10.94f);
        b.lineTo(9.94f, 9.88f);
        b.lineTo(11.0f, 8.82f);
        b.lineTo(9.94f, 7.76f);
        b.lineTo(8.88f, 8.82f);
        b.lineTo(7.82f, 7.76f);
        b.lineTo(6.76f, 8.82f);
        fc.C(b, 1.06f, 1.06f, -1.06f, 1.06f);
        b.moveTo(11.99f, 2.0f);
        b.curveTo(6.47f, 2.0f, 2.0f, 6.47f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f);
        b.reflectiveCurveTo(22.0f, 17.53f, 22.0f, 12.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 11.99f, 2.0f);
        b.close();
        b.moveTo(12.0f, 20.0f);
        b.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        b.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(-3.58f, 8.0f, -8.0f, 8.0f);
        k4.x(b, 16.18f, 7.76f, -1.06f, 1.06f);
        b.lineToRelative(-1.06f, -1.06f);
        b.lineTo(13.0f, 8.82f);
        b.lineToRelative(1.06f, 1.06f);
        b.lineTo(13.0f, 10.94f);
        b.lineTo(14.06f, 12.0f);
        b.lineToRelative(1.06f, -1.06f);
        b.lineTo(16.18f, 12.0f);
        b.lineToRelative(1.06f, -1.06f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(b, -1.06f, -1.06f, 1.06f, -1.06f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sentimentVeryDissatisfied = build;
        build.getClass();
        return build;
    }
}
