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
public final class SecurityKt {
    private static ImageVector _security;

    public static final ImageVector getSecurity(Icons.Outlined outlined) {
        ImageVector imageVector = _security;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Security", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(12.0f, 1.0f, 3.0f, 5.0f, 6.0f);
        s.curveToRelative(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f);
        s.curveToRelative(5.16f, -1.26f, 9.0f, -6.45f, 9.0f, -12.0f);
        bv.o(s, 21.0f, 5.0f, -9.0f, -4.0f);
        s.moveTo(12.0f, 11.99f);
        s.horizontalLineToRelative(7.0f);
        s.curveToRelative(-0.53f, 4.12f, -3.28f, 7.79f, -7.0f, 8.94f);
        s.lineTo(12.0f, 12.0f);
        s.lineTo(5.0f, 12.0f);
        s.lineTo(5.0f, 6.3f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.n(s, 7.0f, -3.11f, 8.8f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _security = build;
        build.getClass();
        return build;
    }
}
