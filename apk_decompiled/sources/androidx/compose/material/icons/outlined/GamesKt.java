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
import defpackage.fc;
import defpackage.gy;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GamesKt {
    private static ImageVector _games;

    public static final ImageVector getGames(Icons.Outlined outlined) {
        ImageVector imageVector = _games;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Games", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(13.0f, 4.0f, 2.67f, -1.0f, 1.0f);
        n.lineToRelative(-1.0f, -1.0f);
        n.lineTo(11.0f, 4.0f);
        n.horizontalLineToRelative(2.0f);
        n.moveToRelative(7.0f, 7.0f);
        n.verticalLineToRelative(2.0f);
        n.horizontalLineToRelative(-2.67f);
        n.lineToRelative(-1.0f, -1.0f);
        n.lineToRelative(1.0f, -1.0f);
        n.lineTo(20.0f, 11.0f);
        n.moveTo(6.67f, 11.0f);
        n.lineToRelative(1.0f, 1.0f);
        n.lineToRelative(-1.0f, 1.0f);
        af0.m(n, 4.0f, 13.0f, -2.0f, 2.67f);
        n.moveTo(12.0f, 16.33f);
        n.lineToRelative(1.0f, 1.0f);
        fc.w(n, 13.0f, 20.0f, -2.0f, -2.67f);
        n.lineToRelative(1.0f, -1.0f);
        n.moveTo(15.0f, 2.0f);
        n.lineTo(9.0f, 2.0f);
        n.verticalLineToRelative(5.5f);
        n.lineToRelative(3.0f, 3.0f);
        gy.B(n, 3.0f, -3.0f, 15.0f, 2.0f);
        n.moveTo(22.0f, 9.0f);
        n.horizontalLineToRelative(-5.5f);
        n.lineToRelative(-3.0f, 3.0f);
        n.lineToRelative(3.0f, 3.0f);
        r6.C(n, 22.0f, 15.0f, 22.0f, 9.0f);
        n.moveTo(7.5f, 9.0f);
        af0.m(n, 2.0f, 9.0f, 6.0f, 5.5f);
        fc.C(n, 3.0f, -3.0f, -3.0f, -3.0f);
        n.moveTo(12.0f, 13.5f);
        n.lineToRelative(-3.0f, 3.0f);
        fc.w(n, 9.0f, 22.0f, 6.0f, -5.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(n, -3.0f, -3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _games = build;
        build.getClass();
        return build;
    }
}
