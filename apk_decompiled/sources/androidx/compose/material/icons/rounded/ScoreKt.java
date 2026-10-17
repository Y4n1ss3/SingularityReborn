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
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScoreKt {
    private static ImageVector _score;

    public static final ImageVector getScore(Icons.Rounded rounded) {
        ImageVector imageVector = _score;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Score", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.0f, 3.0f, 5.0f, 3.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(14.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(14.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(21.0f, 5.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        i.close();
        i.moveTo(12.0f, 5.75f);
        i.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        i.reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f);
        i.lineTo(13.5f, 8.0f);
        i.lineToRelative(1.79f, -2.69f);
        i.curveToRelative(0.13f, -0.19f, 0.35f, -0.31f, 0.59f, -0.31f);
        i.curveToRelative(0.56f, 0.0f, 0.9f, 0.63f, 0.59f, 1.1f);
        i.lineTo(15.2f, 8.0f);
        i.lineToRelative(1.27f, 1.9f);
        i.curveToRelative(0.31f, 0.47f, -0.02f, 1.1f, -0.59f, 1.1f);
        i.curveToRelative(-0.24f, 0.0f, -0.46f, -0.12f, -0.59f, -0.31f);
        i.lineTo(13.5f, 8.0f);
        i.verticalLineToRelative(2.25f);
        i.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        i.reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f);
        r6.l(i, -4.5f, 7.0f, 8.25f);
        i.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        i.horizontalLineToRelative(1.5f);
        i.lineTo(9.5f, 6.5f);
        i.lineTo(7.75f, 6.5f);
        i.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        i.reflectiveCurveTo(7.34f, 5.0f, 7.75f, 5.0f);
        i.lineTo(10.0f, 5.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        i.verticalLineToRelative(1.75f);
        i.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        af0.m(i, 8.5f, 8.75f, 0.75f, 1.75f);
        i.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        i.reflectiveCurveToRelative(-0.34f, 0.75f, -0.75f, 0.75f);
        i.lineTo(8.0f, 11.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        uo.l(i, 7.0f, 8.25f, 18.74f, 13.26f);
        i.lineToRelative(-5.03f, 5.03f);
        i.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        i.lineTo(9.0f, 15.0f);
        i.lineToRelative(-2.49f, 2.49f);
        i.curveToRelative(-0.56f, 0.56f, -1.51f, 0.16f, -1.51f, -0.62f);
        i.curveToRelative(0.0f, -0.23f, 0.09f, -0.46f, 0.26f, -0.62f);
        i.lineToRelative(3.03f, -3.03f);
        i.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        i.lineTo(13.0f, 16.5f);
        i.lineToRelative(4.49f, -4.49f);
        i.curveToRelative(0.56f, -0.56f, 1.51f, -0.16f, 1.51f, 0.62f);
        i.curveToRelative(0.0f, 0.24f, -0.09f, 0.46f, -0.26f, 0.63f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _score = build;
        build.getClass();
        return build;
    }
}
