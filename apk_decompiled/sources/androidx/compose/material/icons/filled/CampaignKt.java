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
import defpackage.af0;
import defpackage.j50;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CampaignKt {
    private static ImageVector _campaign;

    public static final ImageVector getCampaign(Icons.Filled filled) {
        ImageVector imageVector = _campaign;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Campaign", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(18.0f, 11.0f, 2.0f, 4.0f, -2.0f);
        j50.t(s, -4.0f, 16.0f, 17.61f);
        s.curveToRelative(0.96f, 0.71f, 2.21f, 1.65f, 3.2f, 2.39f);
        s.curveToRelative(0.4f, -0.53f, 0.8f, -1.07f, 1.2f, -1.6f);
        s.curveToRelative(-0.99f, -0.74f, -2.24f, -1.68f, -3.2f, -2.4f);
        s.curveToRelative(-0.4f, 0.54f, -0.8f, 1.08f, -1.2f, 1.61f);
        s.close();
        s.moveTo(20.4f, 5.6f);
        s.curveToRelative(-0.4f, -0.53f, -0.8f, -1.07f, -1.2f, -1.6f);
        s.curveToRelative(-0.99f, 0.74f, -2.24f, 1.68f, -3.2f, 2.4f);
        s.curveToRelative(0.4f, 0.53f, 0.8f, 1.07f, 1.2f, 1.6f);
        s.curveToRelative(0.96f, -0.72f, 2.21f, -1.65f, 3.2f, -2.4f);
        s.close();
        s.moveTo(4.0f, 9.0f);
        s.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        s.verticalLineToRelative(2.0f);
        s.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        af0.v(s, 1.0f, 4.0f, 2.0f, -4.0f);
        s.horizontalLineToRelative(1.0f);
        s.lineToRelative(5.0f, 3.0f);
        s.lineTo(13.0f, 6.0f);
        r6.C(s, 8.0f, 9.0f, 4.0f, 9.0f);
        s.moveTo(15.5f, 12.0f);
        s.curveToRelative(0.0f, -1.33f, -0.58f, -2.53f, -1.5f, -3.35f);
        s.verticalLineToRelative(6.69f);
        s.curveToRelative(0.92f, -0.81f, 1.5f, -2.01f, 1.5f, -3.34f);
        s.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, s.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _campaign = build;
        build.getClass();
        return build;
    }
}
