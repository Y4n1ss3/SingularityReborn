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
import defpackage.fc;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ChildFriendlyKt {
    private static ImageVector _childFriendly;

    public static final ImageVector getChildFriendly(Icons.Filled filled) {
        ImageVector imageVector = _childFriendly;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ChildFriendly", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(13.0f, 2.0f, 8.0f, 8.0f);
        m.curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        m.close();
        m.moveTo(19.32f, 15.89f);
        m.curveTo(20.37f, 14.54f, 21.0f, 12.84f, 21.0f, 11.0f);
        m.lineTo(6.44f, 11.0f);
        m.lineToRelative(-0.95f, -2.0f);
        af0.m(m, 2.0f, 9.0f, 2.0f, 2.22f);
        m.reflectiveCurveToRelative(1.89f, 4.07f, 2.12f, 4.42f);
        m.curveToRelative(-1.1f, 0.59f, -1.84f, 1.75f, -1.84f, 3.08f);
        m.curveTo(4.5f, 20.43f, 6.07f, 22.0f, 8.0f, 22.0f);
        m.curveToRelative(1.76f, 0.0f, 3.22f, -1.3f, 3.46f, -3.0f);
        m.horizontalLineToRelative(2.08f);
        m.curveToRelative(0.24f, 1.7f, 1.7f, 3.0f, 3.46f, 3.0f);
        m.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        m.curveToRelative(0.0f, -1.04f, -0.46f, -1.97f, -1.18f, -2.61f);
        m.close();
        m.moveTo(8.0f, 20.0f);
        m.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        m.reflectiveCurveTo(7.17f, 17.0f, 8.0f, 17.0f);
        m.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        m.reflectiveCurveTo(8.83f, 20.0f, 8.0f, 20.0f);
        m.close();
        m.moveTo(17.0f, 20.0f);
        m.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        m.reflectiveCurveTo(16.17f, 17.0f, 17.0f, 17.0f);
        m.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(m, 17.83f, 20.0f, 17.0f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _childFriendly = build;
        build.getClass();
        return build;
    }
}
