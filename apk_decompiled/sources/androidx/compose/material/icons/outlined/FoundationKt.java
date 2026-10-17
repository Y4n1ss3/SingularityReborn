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
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FoundationKt {
    private static ImageVector _foundation;

    public static final ImageVector getFoundation(Icons.Outlined outlined) {
        ImageVector imageVector = _foundation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Foundation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(19.0f, 12.0f, 3.0f, 12.0f, 3.0f);
        fc.w(p, 2.0f, 12.0f, 3.0f, 3.0f);
        uf.k(p, 3.0f, 2.0f, 2.0f, 3.0f);
        af0.v(p, 2.0f, -3.0f, 4.0f, 3.0f);
        af0.v(p, 2.0f, -3.0f, 4.0f, 3.0f);
        af0.v(p, 2.0f, -3.0f, 2.0f, -2.0f);
        uo.r(p, -2.0f, 12.0f, 7.0f, 15.0f);
        k4.z(p, -4.81f, 4.0f, -3.6f, 15.0f);
        af0.x(p, 7.0f, 13.0f, 15.0f, 6.59f);
        p.lineToRelative(4.0f, 3.6f);
        p.verticalLineTo(15.0f);
        p.horizontalLineTo(13.0f);
        p.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, p.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _foundation = build;
        build.getClass();
        return build;
    }
}
