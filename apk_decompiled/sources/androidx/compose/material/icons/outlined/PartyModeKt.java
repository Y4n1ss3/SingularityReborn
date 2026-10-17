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
import defpackage.k4;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PartyModeKt {
    private static ImageVector _partyMode;

    public static final ImageVector getPartyMode(Icons.Outlined outlined) {
        ImageVector imageVector = _partyMode;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PartyMode", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(20.0f, 4.0f, -3.17f, 15.0f, 2.0f);
        p.lineTo(9.0f, 2.0f);
        p.lineTo(7.17f, 4.0f);
        p.lineTo(4.0f, 4.0f);
        p.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        p.verticalLineToRelative(12.0f);
        p.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        p.horizontalLineToRelative(16.0f);
        p.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        p.lineTo(22.0f, 6.0f);
        p.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(p, 20.0f, 18.0f, 4.0f, 18.0f);
        p.lineTo(4.0f, 6.0f);
        p.horizontalLineToRelative(4.05f);
        p.lineToRelative(0.59f, -0.65f);
        p.lineTo(9.88f, 4.0f);
        p.horizontalLineToRelative(4.24f);
        p.lineToRelative(1.24f, 1.35f);
        p.lineToRelative(0.59f, 0.65f);
        bv.r(p, 20.0f, 6.0f, 12.0f);
        p.moveTo(9.0f, 12.0f);
        p.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        p.horizontalLineToRelative(3.98f);
        p.curveToRelative(-0.92f, -1.21f, -2.35f, -2.0f, -3.98f, -2.0f);
        p.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        p.curveToRelative(0.0f, 0.34f, 0.04f, 0.68f, 0.1f, 1.0f);
        p.horizontalLineToRelative(2.08f);
        p.curveToRelative(-0.11f, -0.31f, -0.18f, -0.65f, -0.18f, -1.0f);
        p.close();
        p.moveTo(15.0f, 12.0f);
        p.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        p.lineTo(8.02f, 15.0f);
        p.curveToRelative(0.92f, 1.21f, 2.35f, 2.0f, 3.98f, 2.0f);
        p.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        p.curveToRelative(0.0f, -0.34f, -0.03f, -0.68f, -0.1f, -1.0f);
        p.horizontalLineToRelative(-2.08f);
        p.curveToRelative(0.11f, 0.31f, 0.18f, 0.65f, 0.18f, 1.0f);
        p.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, p.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _partyMode = build;
        build.getClass();
        return build;
    }
}
