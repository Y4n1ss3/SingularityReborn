package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PartyModeKt {
    private static ImageVector _partyMode;

    public static final ImageVector getPartyMode(Icons.Filled filled) {
        ImageVector imageVector = _partyMode;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PartyMode", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        p.close();
        p.moveTo(12.0f, 7.0f);
        p.curveToRelative(1.63f, 0.0f, 3.06f, 0.79f, 3.98f, 2.0f);
        p.lineTo(12.0f, 9.0f);
        p.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        p.curveToRelative(0.0f, 0.35f, 0.07f, 0.69f, 0.18f, 1.0f);
        p.lineTo(7.1f, 13.0f);
        p.curveToRelative(-0.06f, -0.32f, -0.1f, -0.66f, -0.1f, -1.0f);
        p.curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f);
        p.close();
        p.moveTo(12.0f, 17.0f);
        p.curveToRelative(-1.63f, 0.0f, -3.06f, -0.79f, -3.98f, -2.0f);
        p.lineTo(12.0f, 15.0f);
        p.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        p.curveToRelative(0.0f, -0.35f, -0.07f, -0.69f, -0.18f, -1.0f);
        p.horizontalLineToRelative(2.08f);
        p.curveToRelative(0.07f, 0.32f, 0.1f, 0.66f, 0.1f, 1.0f);
        p.curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f);
        p.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, p.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _partyMode = build;
        build.getClass();
        return build;
    }
}
