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
import defpackage.fc;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BedroomChildKt {
    private static ImageVector _bedroomChild;

    public static final ImageVector getBedroomChild(Icons.Outlined outlined) {
        ImageVector imageVector = _bedroomChild;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BedroomChild", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = kp0.y(20.0f, 4.0f, 16.0f, 4.0f, 4.0f);
        r6.z(y, 20.0f, 20.0f, 2.0f, 4.0f);
        y.curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        y.verticalLineToRelative(16.0f);
        y.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        y.horizontalLineToRelative(16.0f);
        y.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        y.verticalLineTo(4.0f);
        y.curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        bv.g(y, 16.5f, 10.67f, 9.0f);
        y.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        y.horizontalLineToRelative(-5.0f);
        y.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        y.verticalLineToRelative(1.67f);
        y.curveToRelative(-0.88f, 0.35f, -1.5f, 1.2f, -1.5f, 2.2f);
        uf.p(y, 17.0f, 1.5f, -1.5f, 9.0f);
        r6.v(y, 17.0f, 18.0f, -4.13f);
        y.curveTo(18.0f, 11.87f, 17.38f, 11.02f, 16.5f, 10.67f);
        af0.A(y, 15.0f, 8.5f, 2.0f, 9.0f);
        kf0.n(y, -2.0f, 15.0f, 7.5f, 12.87f);
        y.curveTo(7.5f, 12.39f, 7.89f, 12.0f, 8.37f, 12.0f);
        y.horizontalLineToRelative(7.27f);
        y.curveToRelative(0.48f, 0.0f, 0.87f, 0.39f, 0.87f, 0.87f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.p(y, 14.0f, -9.0f, -1.13f, 7.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bedroomChild = build;
        build.getClass();
        return build;
    }
}
