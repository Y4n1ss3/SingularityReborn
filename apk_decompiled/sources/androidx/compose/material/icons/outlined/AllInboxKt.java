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
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AllInboxKt {
    private static ImageVector _allInbox;

    public static final ImageVector getAllInbox(Icons.Outlined outlined) {
        ImageVector imageVector = _allInbox;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AllInbox", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.0f, 3.0f, 5.0f, 3.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(7.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(14.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(21.0f, 5.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        af0.l(i, 5.0f, 10.0f, 3.13f);
        i.curveToRelative(0.21f, 0.78f, 0.67f, 1.47f, 1.27f, 2.0f);
        bv.r(i, 5.0f, 12.0f, -2.0f);
        i.moveTo(19.0f, 12.0f);
        i.horizontalLineToRelative(-4.4f);
        i.curveToRelative(0.6f, -0.53f, 1.06f, -1.22f, 1.27f, -2.0f);
        bv.r(i, 19.0f, 10.0f, 2.0f);
        k4.C(i, 19.0f, 8.0f, -5.0f, 1.0f);
        i.curveToRelative(0.0f, 1.07f, -0.93f, 2.0f, -2.0f, 2.0f);
        i.reflectiveCurveToRelative(-2.0f, -0.93f, -2.0f, -2.0f);
        i.lineTo(10.0f, 8.0f);
        i.lineTo(5.0f, 8.0f);
        r6.m(i, 5.0f, 5.0f, 14.0f, 3.0f);
        k4.C(i, 17.0f, 15.0f, -3.0f, 1.0f);
        i.curveToRelative(0.0f, 0.47f, -0.19f, 0.9f, -0.48f, 1.25f);
        i.curveToRelative(-0.37f, 0.45f, -0.92f, 0.75f, -1.52f, 0.75f);
        i.reflectiveCurveToRelative(-1.15f, -0.3f, -1.52f, -0.75f);
        i.curveToRelative(-0.29f, -0.35f, -0.48f, -0.78f, -0.48f, -1.25f);
        bv.q(i, -1.0f, 3.0f, 15.0f, 4.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(14.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        kf0.C(i, -4.0f, -4.0f, 5.0f, 17.0f);
        i.horizontalLineToRelative(3.13f);
        i.curveToRelative(0.02f, 0.09f, 0.06f, 0.17f, 0.09f, 0.25f);
        i.curveToRelative(0.24f, 0.68f, 0.65f, 1.28f, 1.18f, 1.75f);
        bv.r(i, 5.0f, 19.0f, -2.0f);
        i.moveTo(19.0f, 19.0f);
        i.horizontalLineToRelative(-4.4f);
        i.curveToRelative(0.54f, -0.47f, 0.95f, -1.07f, 1.18f, -1.75f);
        i.curveToRelative(0.03f, -0.08f, 0.07f, -0.16f, 0.09f, -0.25f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.f(i, 19.0f, 17.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _allInbox = build;
        build.getClass();
        return build;
    }
}
