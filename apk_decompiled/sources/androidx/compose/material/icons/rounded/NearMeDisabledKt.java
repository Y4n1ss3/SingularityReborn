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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NearMeDisabledKt {
    private static ImageVector _nearMeDisabled;

    public static final ImageVector getNearMeDisabled(Icons.Rounded rounded) {
        ImageVector imageVector = _nearMeDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NearMeDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(12.0f, 6.34f, 6.95f, -2.58f);
        e.curveToRelative(0.8f, -0.3f, 1.58f, 0.48f, 1.29f, 1.29f);
        r6.C(e, 17.66f, 12.0f, 12.0f, 6.34f);
        e.moveTo(21.9f, 19.07f);
        e.lineTo(4.93f, 2.1f);
        e.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        e.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        e.lineToRelative(4.36f, 4.36f);
        e.lineToRelative(-4.2f, 1.56f);
        e.curveTo(3.27f, 9.59f, 3.0f, 9.97f, 3.0f, 10.4f);
        e.curveToRelative(0.0f, 0.42f, 0.26f, 0.8f, 0.65f, 0.96f);
        e.lineToRelative(6.42f, 2.57f);
        e.lineToRelative(2.57f, 6.42f);
        e.curveTo(12.8f, 20.74f, 13.18f, 21.0f, 13.6f, 21.0f);
        e.curveToRelative(0.43f, 0.0f, 0.82f, -0.27f, 0.97f, -0.67f);
        e.lineToRelative(1.56f, -4.2f);
        e.lineToRelative(4.36f, 4.36f);
        e.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        e.curveTo(22.29f, 20.09f, 22.29f, 19.46f, 21.9f, 19.07f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nearMeDisabled = build;
        build.getClass();
        return build;
    }
}
