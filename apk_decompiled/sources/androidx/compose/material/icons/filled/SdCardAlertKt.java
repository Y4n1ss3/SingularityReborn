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
import defpackage.fc;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SdCardAlertKt {
    private static ImageVector _sdCardAlert;

    public static final ImageVector getSdCardAlert(Icons.Filled filled) {
        ImageVector imageVector = _sdCardAlert;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SdCardAlert", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(18.0f, 2.0f, -8.0f, 4.02f, 8.0f);
        p.lineTo(4.0f, 20.0f);
        p.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        p.horizontalLineToRelative(12.0f);
        p.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        p.verticalLineTo(4.0f);
        p.curveTo(20.0f, 2.9f, 19.1f, 2.0f, 18.0f, 2.0f);
        r6.B(p, 13.0f, 17.0f, -2.0f, -2.0f);
        uo.r(p, 2.0f, 17.0f, 13.0f, 13.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.h(p, -2.0f, 8.0f, 2.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sdCardAlert = build;
        build.getClass();
        return build;
    }
}
