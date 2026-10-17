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
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PrivacyTipKt {
    private static ImageVector _privacyTip;

    public static final ImageVector getPrivacyTip(Icons.Outlined outlined) {
        ImageVector imageVector = _privacyTip;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PrivacyTip", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder j = kf0.j(12.0f, 3.19f, 7.0f, 3.11f, 11.0f);
        j.curveToRelative(0.0f, 4.52f, -2.98f, 8.69f, -7.0f, 9.93f);
        j.curveTo(7.98f, 19.69f, 5.0f, 15.52f, 5.0f, 11.0f);
        j.verticalLineTo(6.3f);
        j.lineTo(12.0f, 3.19f);
        j.moveTo(12.0f, 1.0f);
        j.lineTo(3.0f, 5.0f);
        j.verticalLineToRelative(6.0f);
        j.curveToRelative(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f);
        j.curveToRelative(5.16f, -1.26f, 9.0f, -6.45f, 9.0f, -12.0f);
        j.verticalLineTo(5.0f);
        r6.C(j, 12.0f, 1.0f, 12.0f, 1.0f);
        k4.C(j, 11.0f, 7.0f, 2.0f, 2.0f);
        uo.r(j, -2.0f, 7.0f, 11.0f, 11.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.m(j, 2.0f, 6.0f, -2.0f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _privacyTip = build;
        build.getClass();
        return build;
    }
}
