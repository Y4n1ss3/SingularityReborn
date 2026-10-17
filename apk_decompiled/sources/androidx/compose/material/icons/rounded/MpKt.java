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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MpKt {
    private static ImageVector _mp;

    public static final ImageVector getMp(Icons.Rounded rounded) {
        ImageVector imageVector = _mp;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Mp", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(19.0f, 3.0f, 5.0f);
        d.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        d.verticalLineToRelative(14.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(14.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(5.0f);
        d.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        af0.l(d, 7.0f, 9.0f, 4.5f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        d.verticalLineToRelative(4.25f);
        d.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        d.horizontalLineToRelative(0.0f);
        d.curveTo(11.34f, 15.0f, 11.0f, 14.66f, 11.0f, 14.25f);
        kf0.r(d, 10.5f, -1.0f, 2.25f);
        d.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        d.horizontalLineToRelative(0.0f);
        d.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        kf0.r(d, 10.5f, -1.0f, 3.75f);
        d.curveTo(7.5f, 14.66f, 7.16f, 15.0f, 6.75f, 15.0f);
        d.horizontalLineToRelative(0.0f);
        d.curveTo(6.34f, 15.0f, 6.0f, 14.66f, 6.0f, 14.25f);
        d.verticalLineTo(10.0f);
        d.curveTo(6.0f, 9.45f, 6.45f, 9.0f, 7.0f, 9.0f);
        k4.r(d, 14.25f, 15.0f, 14.25f, 15.0f);
        d.curveToRelative(-0.41f, 0.0f, -0.75f, -0.33f, -0.75f, -0.75f);
        d.verticalLineTo(10.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.horizontalLineTo(17.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        d.verticalLineToRelative(2.5f);
        d.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d.horizontalLineToRelative(-2.0f);
        d.verticalLineToRelative(0.75f);
        d.curveTo(15.0f, 14.66f, 14.66f, 15.0f, 14.25f, 15.0f);
        r6.B(d, 15.0f, 12.0f, 1.5f, -1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(d, 15.0f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mp = build;
        build.getClass();
        return build;
    }
}
