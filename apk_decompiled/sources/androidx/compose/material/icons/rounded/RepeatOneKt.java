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
import defpackage.bv;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RepeatOneKt {
    private static ImageVector _repeatOne;

    public static final ImageVector getRepeatOne(Icons.Rounded rounded) {
        ImageVector imageVector = _repeatOne;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RepeatOne", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(7.0f, 7.0f, 10.0f, 1.79f);
        b.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        b.lineToRelative(2.79f, -2.79f);
        b.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        b.lineToRelative(-2.79f, -2.79f);
        b.curveToRelative(-0.31f, -0.31f, -0.85f, -0.09f, -0.85f, 0.36f);
        b.lineTo(17.0f, 5.0f);
        b.lineTo(6.0f, 5.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(4.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        uo.l(b, 7.0f, 7.0f, 17.0f, 17.0f);
        b.lineTo(7.0f, 17.0f);
        b.verticalLineToRelative(-1.79f);
        b.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        b.lineToRelative(-2.79f, 2.79f);
        b.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        b.lineToRelative(2.79f, 2.79f);
        b.curveToRelative(0.31f, 0.31f, 0.85f, 0.09f, 0.85f, -0.36f);
        b.lineTo(7.0f, 19.0f);
        b.horizontalLineToRelative(11.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-4.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        r6.l(b, 3.0f, 13.0f, 14.25f);
        b.lineTo(13.0f, 9.81f);
        b.curveToRelative(0.0f, -0.45f, -0.36f, -0.81f, -0.81f, -0.81f);
        b.curveToRelative(-0.13f, 0.0f, -0.25f, 0.03f, -0.36f, 0.09f);
        b.lineToRelative(-1.49f, 0.74f);
        b.curveToRelative(-0.21f, 0.1f, -0.34f, 0.32f, -0.34f, 0.55f);
        b.curveToRelative(0.0f, 0.34f, 0.28f, 0.62f, 0.62f, 0.62f);
        b.horizontalLineToRelative(0.88f);
        b.verticalLineToRelative(3.25f);
        b.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, 0.75f, -0.34f, 0.75f, -0.75f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _repeatOne = build;
        build.getClass();
        return build;
    }
}
