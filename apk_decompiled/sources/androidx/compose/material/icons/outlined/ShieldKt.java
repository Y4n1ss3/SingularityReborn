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
import defpackage.bv;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShieldKt {
    private static ImageVector _shield;

    public static final ImageVector getShield(Icons.Outlined outlined) {
        ImageVector imageVector = _shield;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Shield", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(12.0f, 2.0f, 4.0f, 5.0f, 6.09f);
        s.curveToRelative(0.0f, 5.05f, 3.41f, 9.76f, 8.0f, 10.91f);
        s.curveToRelative(4.59f, -1.15f, 8.0f, -5.86f, 8.0f, -10.91f);
        bv.k(s, 5.0f, 12.0f, 2.0f);
        s.moveTo(18.0f, 11.09f);
        s.curveToRelative(0.0f, 4.0f, -2.55f, 7.7f, -6.0f, 8.83f);
        s.curveToRelative(-3.45f, -1.13f, -6.0f, -4.82f, -6.0f, -8.83f);
        s.verticalLineToRelative(-4.7f);
        s.lineToRelative(6.0f, -2.25f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.j(s, 6.0f, 2.25f, 11.09f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shield = build;
        build.getClass();
        return build;
    }
}
