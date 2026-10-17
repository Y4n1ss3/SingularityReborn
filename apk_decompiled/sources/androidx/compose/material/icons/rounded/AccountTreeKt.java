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
import defpackage.af0;
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AccountTreeKt {
    private static ImageVector _accountTree;

    public static final ImageVector getAccountTree(Icons.Rounded rounded) {
        ImageVector imageVector = _accountTree;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AccountTree", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(17.0f, 11.0f, 3.0f);
        a.curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        a.verticalLineTo(5.0f);
        a.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        a.horizontalLineToRelative(-3.0f);
        a.curveToRelative(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        gy.i(a, 1.0f, 9.01f, 5.0f);
        a.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        a.horizontalLineTo(4.0f);
        a.curveTo(2.9f, 3.0f, 2.0f, 3.9f, 2.0f, 5.0f);
        a.verticalLineToRelative(4.0f);
        a.curveToRelative(0.0f, 1.11f, 0.9f, 2.0f, 2.0f, 2.0f);
        a.horizontalLineToRelative(3.0f);
        a.curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        r6.v(a, 8.0f, 11.0f, 7.01f);
        a.curveToRelative(0.0f, 1.65f, 1.34f, 2.99f, 2.99f, 2.99f);
        a.horizontalLineTo(15.0f);
        a.verticalLineToRelative(1.0f);
        a.curveToRelative(0.0f, 1.11f, 0.9f, 2.0f, 2.0f, 2.0f);
        a.horizontalLineToRelative(3.0f);
        a.curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        a.verticalLineToRelative(-4.0f);
        a.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        a.horizontalLineToRelative(-3.0f);
        a.curveToRelative(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        a.verticalLineToRelative(1.0f);
        a.horizontalLineToRelative(-1.01f);
        a.curveTo(13.45f, 16.0f, 13.0f, 15.55f, 13.0f, 15.01f);
        kf0.r(a, 8.0f, 2.0f, 1.0f);
        a.curveTo(15.0f, 10.1f, 15.9f, 11.0f, 17.0f, 11.0f);
        a.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _accountTree = build;
        build.getClass();
        return build;
    }
}
