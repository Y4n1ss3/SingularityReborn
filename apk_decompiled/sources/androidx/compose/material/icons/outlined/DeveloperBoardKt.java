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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DeveloperBoardKt {
    private static ImageVector _developerBoard;

    public static final ImageVector getDeveloperBoard(Icons.Outlined outlined) {
        ImageVector imageVector = _developerBoard;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DeveloperBoard", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(22.0f, 9.0f, 22.0f, 7.0f, -2.0f);
        k.lineTo(20.0f, 5.0f);
        k.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k.lineTo(4.0f, 3.0f);
        k.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        k.verticalLineToRelative(14.0f);
        k.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        k.horizontalLineToRelative(14.0f);
        k.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        r6.D(k, -2.0f, 2.0f, -2.0f, -2.0f);
        r6.D(k, -2.0f, 2.0f, -2.0f, -2.0f);
        uf.j(k, 20.0f, 9.0f, 2.0f);
        k.moveTo(18.0f, 19.0f);
        k.lineTo(4.0f, 19.0f);
        r6.m(k, 4.0f, 5.0f, 14.0f, 14.0f);
        k4.C(k, 6.0f, 13.0f, 5.0f, 4.0f);
        bv.r(k, 6.0f, 17.0f, -4.0f);
        k4.C(k, 12.0f, 7.0f, 4.0f, 3.0f);
        gy.n(k, -4.0f, 12.0f, 7.0f);
        k4.C(k, 6.0f, 7.0f, 5.0f, 5.0f);
        r6.C(k, 6.0f, 12.0f, 6.0f, 7.0f);
        k4.C(k, 12.0f, 11.0f, 4.0f, 6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(k, -4.0f, -6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _developerBoard = build;
        build.getClass();
        return build;
    }
}
