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
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NightShelterKt {
    private static ImageVector _nightShelter;

    public static final ImageVector getNightShelter(Icons.Filled filled) {
        ImageVector imageVector = _nightShelter;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NightShelter", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(12.0f, 3.0f, 4.0f, 9.0f, 12.0f);
        uf.w(s, 16.0f, 9.0f, 12.0f, 3.0f);
        s.moveTo(9.75f, 12.5f);
        s.curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f);
        s.reflectiveCurveTo(10.44f, 15.0f, 9.75f, 15.0f);
        s.reflectiveCurveTo(8.5f, 14.44f, 8.5f, 13.75f);
        s.reflectiveCurveTo(9.06f, 12.5f, 9.75f, 12.5f);
        r6.B(s, 17.0f, 18.0f, -1.0f, -1.5f);
        gy.x(s, 8.0f, 18.0f, 7.0f, -7.0f);
        af0.w(s, 1.0f, 4.5f, 3.5f, 12.0f);
        s.horizontalLineTo(15.0f);
        s.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(s, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nightShelter = build;
        build.getClass();
        return build;
    }
}
