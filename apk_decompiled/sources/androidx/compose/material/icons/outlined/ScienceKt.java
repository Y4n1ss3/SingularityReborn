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
import defpackage.fc;
import defpackage.gy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScienceKt {
    private static ImageVector _science;

    public static final ImageVector getScience(Icons.Outlined outlined) {
        ImageVector imageVector = _science;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Science", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = gy.p(13.0f, 11.33f, 18.0f, 18.0f, 6.0f);
        fc.u(p, 5.0f, -6.67f, 6.0f, 2.0f);
        p.moveTo(15.96f, 4.0f);
        p.horizontalLineTo(8.04f);
        p.curveTo(7.62f, 4.0f, 7.39f, 4.48f, 7.65f, 4.81f);
        p.lineTo(9.0f, 6.5f);
        p.verticalLineToRelative(4.17f);
        p.lineTo(3.2f, 18.4f);
        p.curveTo(2.71f, 19.06f, 3.18f, 20.0f, 4.0f, 20.0f);
        p.horizontalLineToRelative(16.0f);
        p.curveToRelative(0.82f, 0.0f, 1.29f, -0.94f, 0.8f, -1.6f);
        p.lineTo(15.0f, 10.67f);
        p.verticalLineTo(6.5f);
        p.lineToRelative(1.35f, -1.69f);
        p.curveTo(16.61f, 4.48f, 16.38f, 4.0f, 15.96f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(p, 15.96f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _science = build;
        build.getClass();
        return build;
    }
}
