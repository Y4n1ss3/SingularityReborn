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
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MuseumKt {
    private static ImageVector _museum;

    public static final ImageVector getMuseum(Icons.Filled filled) {
        ImageVector imageVector = _museum;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Museum", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder j = af0.j(22.0f, 11.0f, 9.0f, 12.0f, 2.0f);
        af0.m(j, 2.0f, 9.0f, 2.0f, 2.0f);
        af0.B(j, 9.0f, 2.0f, 2.0f, 20.0f);
        fc.y(j, -2.0f, -2.0f, -9.0f, 22.0f);
        k4.C(j, 16.0f, 18.0f, -2.0f, -4.0f);
        j.lineToRelative(-2.0f, 3.0f);
        gy.j(j, -2.0f, -3.0f, 4.0f, 8.0f);
        gy.C(j, -7.0f, 2.0f, 2.0f, 3.0f);
        j.lineToRelative(2.0f, -3.0f);
        j.horizontalLineToRelative(2.0f);
        j.verticalLineTo(18.0f);
        j.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _museum = build;
        build.getClass();
        return build;
    }
}
