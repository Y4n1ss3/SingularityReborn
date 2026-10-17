package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import defpackage.fb0;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.q10;
import defpackage.ql0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactory {
    public static final int $stable = 8;
    private final iy itemProvider;
    private final fb0 lambdasCache;
    private final SaveableStateHolder saveableStateHolder;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class CachedItemContent {
        private my _content;
        private final Object contentType;
        private int index;
        private final Object key;

        public CachedItemContent(int i, Object obj, Object obj2) {
            this.key = obj;
            this.contentType = obj2;
            this.index = i;
        }

        private final my createContentLambda() {
            return ComposableLambdaKt.composableLambdaInstance(818252804, true, new c(0, LazyLayoutItemContentFactory.this, this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w01 createContentLambda$lambda$0(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, CachedItemContent cachedItemContent, Composer composer, int i) {
            Composer composer2;
            int i2 = 0;
            if (composer.shouldExecute((i & 3) != 2, i & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(818252804, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:85)");
                }
                LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) lazyLayoutItemContentFactory.getItemProvider().invoke();
                int i3 = cachedItemContent.index;
                if ((i3 >= lazyLayoutItemProvider.getItemCount() || !q10.b(lazyLayoutItemProvider.getKey(i3), cachedItemContent.key)) && (i3 = lazyLayoutItemProvider.getIndex(cachedItemContent.key)) != -1) {
                    cachedItemContent.index = i3;
                }
                int i4 = i3;
                if (i4 != -1) {
                    composer.startReplaceGroup(-1664741271);
                    composer2 = composer;
                    LazyLayoutItemContentFactoryKt.m926SkippableItemJVlU9Rs(lazyLayoutItemProvider, StableValue.m953constructorimpl(lazyLayoutItemContentFactory.saveableStateHolder), i4, StableValue.m953constructorimpl(cachedItemContent.key), composer2, 0);
                } else {
                    composer2 = composer;
                    composer2.startReplaceGroup(-1668376610);
                }
                composer2.endReplaceGroup();
                Object obj = cachedItemContent.key;
                boolean changedInstance = composer2.changedInstance(cachedItemContent);
                Object rememberedValue = composer2.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new d(cachedItemContent, i2);
                    composer2.updateRememberedValue(rememberedValue);
                }
                EffectsKt.DisposableEffect(obj, (ky) rememberedValue, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return w01.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DisposableEffectResult createContentLambda$lambda$0$0$0(final CachedItemContent cachedItemContent, DisposableEffectScope disposableEffectScope) {
            return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$lambda$0$0$0$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    LazyLayoutItemContentFactory.CachedItemContent.this._content = null;
                }
            };
        }

        public final my getContent() {
            my myVar = this._content;
            if (myVar != null) {
                return myVar;
            }
            my createContentLambda = createContentLambda();
            this._content = createContentLambda;
            return createContentLambda;
        }

        public final Object getContentType() {
            return this.contentType;
        }

        public final int getIndex() {
            return this.index;
        }

        public final Object getKey() {
            return this.key;
        }
    }

    public LazyLayoutItemContentFactory(SaveableStateHolder saveableStateHolder, iy iyVar) {
        this.saveableStateHolder = saveableStateHolder;
        this.itemProvider = iyVar;
        long[] jArr = ql0.a;
        this.lambdasCache = new fb0();
    }

    public final my getContent(int i, Object obj, Object obj2) {
        CachedItemContent cachedItemContent = (CachedItemContent) this.lambdasCache.d(obj);
        if (cachedItemContent != null && cachedItemContent.getIndex() == i && q10.b(cachedItemContent.getContentType(), obj2)) {
            return cachedItemContent.getContent();
        }
        CachedItemContent cachedItemContent2 = new CachedItemContent(i, obj, obj2);
        this.lambdasCache.l(obj, cachedItemContent2);
        return cachedItemContent2.getContent();
    }

    public final Object getContentType(Object obj) {
        if (obj == null) {
            return null;
        }
        CachedItemContent cachedItemContent = (CachedItemContent) this.lambdasCache.d(obj);
        if (cachedItemContent != null) {
            return cachedItemContent.getContentType();
        }
        LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) this.itemProvider.invoke();
        int index = lazyLayoutItemProvider.getIndex(obj);
        if (index != -1) {
            return lazyLayoutItemProvider.getContentType(index);
        }
        return null;
    }

    public final iy getItemProvider() {
        return this.itemProvider;
    }
}
