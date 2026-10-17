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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoTransferKt {
    private static ImageVector _noTransfer;

    public static final ImageVector getNoTransfer(Icons.Filled filled) {
        ImageVector imageVector = _noTransfer;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NoTransfer", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.19f, 21.19f, 2.81f, 2.81f);
        i.lineTo(1.39f, 4.22f);
        i.lineTo(4.0f, 6.83f);
        i.verticalLineTo(16.0f);
        i.curveToRelative(0.0f, 0.88f, 0.39f, 1.67f, 1.0f, 2.22f);
        i.verticalLineTo(20.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(1.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        kf0.z(i, -1.0f, 8.0f, 1.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(1.0f);
        i.curveToRelative(0.05f, 0.0f, 0.09f, -0.02f, 0.14f, -0.03f);
        gy.B(i, 1.64f, 1.64f, 21.19f, 21.19f);
        i.moveTo(7.5f, 17.0f);
        i.curveTo(6.67f, 17.0f, 6.0f, 16.33f, 6.0f, 15.5f);
        i.curveTo(6.0f, 14.67f, 6.67f, 14.0f, 7.5f, 14.0f);
        i.reflectiveCurveTo(9.0f, 14.67f, 9.0f, 15.5f);
        i.curveTo(9.0f, 16.33f, 8.33f, 17.0f, 7.5f, 17.0f);
        bv.g(i, 6.0f, 11.0f, 8.83f);
        kf0.h(i, 8.17f, 11.0f, 6.0f);
        i.moveTo(8.83f, 6.0f);
        i.lineTo(5.78f, 2.95f);
        i.curveTo(7.24f, 2.16f, 9.48f, 2.0f, 12.0f, 2.0f);
        i.curveToRelative(4.42f, 0.0f, 8.0f, 0.5f, 8.0f, 4.0f);
        i.verticalLineToRelative(10.0f);
        i.curveToRelative(0.0f, 0.35f, -0.08f, 0.67f, -0.19f, 0.98f);
        fc.v(i, 13.83f, 11.0f, 18.0f, 6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(i, 8.83f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noTransfer = build;
        build.getClass();
        return build;
    }
}
