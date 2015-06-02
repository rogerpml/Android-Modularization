package com.tomaszpolanski.androidsandbox.utils.option;

import com.android.internal.util.Predicate;

import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.functions.Func2;

public final class None<A> extends Option<A> {

    None() { }

    @Override
    public void iter(final Action1<A> action) {
        // Do nothing
    }

    @Override
    public <B> Option<B> map(final Func1<A, B> f) {
        return NONE;
    }

    @Override
    public <B> Option<B> flatMap(final Func1<A, Option<B>> f) {
        return NONE;
    }

    @Override
    public Option<A> filter(final Predicate<? super A> predicate) {
        return NONE;
    }

    @Override
    public Option<A> orOption(final Func0<Option<A>> f) {
        return f.call();
    }

    @Override
    public A orDefault(final Func0<A> def) {
        return def.call();
    }

    @Override
    public A get() {
        throw new IllegalStateException();
    }

    @Override
    public <R> Option<R> ofType(Class<R> type) {
        return Option.NONE;
    }

    @Override
    public void match(final Action1<A> fSome, final Action0 fNone) {
        fNone.call();
    }

    @Override
    public <R> R matchResult(final Func1<A, R> fSome, final Func0<R> fNone) {
        return fNone.call();
    }

    @Override
    public <B, C> Option<C> lift(final Option<B> optionB, final Func2<A, B, C> f) {
        return NONE;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
