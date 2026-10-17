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
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GifBoxKt {
    private static ImageVector _gifBox;

    public static final ImageVector getGifBox(Icons.Outlined outlined) {
        ImageVector imageVector = _gifBox;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.GifBox", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder f = k4.f(19.0f, 19.0f, 5.0f, 5.0f, 14.0f);
        bv.t(f, 19.0f, 5.0f, 3.0f);
        f.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        f.verticalLineToRelative(14.0f);
        f.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        f.horizontalLineToRelative(14.0f);
        f.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        f.verticalLineTo(5.0f);
        f.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        kp0.r(f, 5.0f, 11.5f, 14.0f, 1.0f);
        k4.p(f, -4.0f, -1.0f, 14.0f);
        k4.C(f, 13.5f, 14.0f, 1.0f, -1.5f);
        af0.g(f, 16.0f, -1.0f, -1.5f, 11.0f);
        bv.l(f, 2.0f, -1.0f, -3.0f, 14.0f);
        bv.y(f, 9.5f, 12.0f, 1.0f, -1.0f);
        f.verticalLineToRelative(-2.0f);
        f.horizontalLineToRelative(2.0f);
        f.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        f.horizontalLineToRelative(-1.0f);
        f.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        f.verticalLineToRelative(2.0f);
        f.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        f.horizontalLineToRelative(1.0f);
        f.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.e(f, -1.0f, 9.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gifBox = build;
        build.getClass();
        return build;
    }
}
