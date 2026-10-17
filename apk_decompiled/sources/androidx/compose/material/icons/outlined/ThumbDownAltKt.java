package androidx.compose.material.icons.outlined;

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
import defpackage.bv;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ThumbDownAltKt {
    private static ImageVector _thumbDownAlt;

    public static final ImageVector getThumbDownAlt(Icons.Outlined outlined) {
        ImageVector imageVector = _thumbDownAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ThumbDownAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(15.0f, 3.0f, 6.0f, 3.0f);
        i.curveToRelative(-0.83f, 0.0f, -1.54f, 0.5f, -1.84f, 1.22f);
        i.lineToRelative(-3.02f, 7.05f);
        i.curveToRelative(-0.09f, 0.23f, -0.14f, 0.47f, -0.14f, 0.73f);
        i.verticalLineToRelative(2.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(6.31f);
        i.lineToRelative(-0.95f, 4.57f);
        i.lineToRelative(-0.03f, 0.32f);
        i.curveToRelative(0.0f, 0.41f, 0.17f, 0.79f, 0.44f, 1.06f);
        i.lineTo(9.83f, 23.0f);
        i.lineToRelative(6.58f, -6.59f);
        i.curveToRelative(0.37f, -0.36f, 0.59f, -0.86f, 0.59f, -1.41f);
        i.lineTo(17.0f, 5.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.x(i, 15.0f, 15.0f, -4.34f, 4.34f);
        i.lineTo(11.77f, 14.0f);
        i.lineTo(3.0f, 14.0f);
        r6.h(i, -2.0f, 3.0f, -7.0f, 9.0f);
        bv.m(i, 10.0f, 19.0f, 3.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.s(i, 12.0f, -4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbDownAlt = build;
        build.getClass();
        return build;
    }
}
